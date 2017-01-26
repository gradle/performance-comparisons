package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_376 {
    private final Production76_376 production = new Production76_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}