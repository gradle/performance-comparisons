package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_227 {
    private final Production76_227 production = new Production76_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}