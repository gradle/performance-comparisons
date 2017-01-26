package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_123 {
    private final Production76_123 production = new Production76_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}