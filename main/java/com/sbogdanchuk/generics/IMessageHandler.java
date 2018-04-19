package com.sbogdanchuk.generics;

public interface IMessageHandler<T extends AMessage> {
    String handle(T payload);
}
