package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_117 {
    private final Production76_117 production = new Production76_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}