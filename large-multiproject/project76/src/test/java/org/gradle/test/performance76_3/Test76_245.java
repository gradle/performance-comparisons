package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_245 {
    private final Production76_245 production = new Production76_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}