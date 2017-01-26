package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_456 {
    private final Production76_456 production = new Production76_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}