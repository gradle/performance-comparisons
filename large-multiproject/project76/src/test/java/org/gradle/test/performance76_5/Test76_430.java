package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_430 {
    private final Production76_430 production = new Production76_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}