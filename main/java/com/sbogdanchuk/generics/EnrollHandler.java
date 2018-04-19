package com.sbogdanchuk.generics;

public class EnrollHandler implements IMessageHandler<EnrollRequest> {
    @Override
    public String handle(EnrollRequest payload) {
        return "OG";
    }
}
