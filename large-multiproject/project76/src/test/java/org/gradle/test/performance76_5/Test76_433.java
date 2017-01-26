package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_433 {
    private final Production76_433 production = new Production76_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}