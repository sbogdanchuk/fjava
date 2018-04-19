package com.sbogdanchuk.generics;

public class Main {

    public static final IMessageHandler<? extends AMessage> enrollHandler;
    public static final IMessageHandler<? extends AMessage> successExtractionResultHandler;
    static {
        enrollHandler = new EnrollHandler();
        successExtractionResultHandler = new SuccessExtractionResultHandler();
    }
    public static void main(String[] args) {
        EnrollRequest enrollRequest = new EnrollRequest();
        ExtractTemplateSuccessResponse etsr = new ExtractTemplateSuccessResponse();
        handle(enrollRequest, enrollHandler);
        handle(etsr, successExtractionResultHandler);
    }

    private static <T extends AMessage> void handle(AMessage msg, IMessageHandler<T> handler) {
        handler.handle((T) msg); //@TODO WTF?
    }


}
