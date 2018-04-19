package com.sbogdanchuk.generics;

public class SuccessExtractionResultHandler implements IMessageHandler<ExtractTemplateSuccessResponse> {
    @Override
    public String handle(ExtractTemplateSuccessResponse payload) {
        return "OG2";
    }
}
