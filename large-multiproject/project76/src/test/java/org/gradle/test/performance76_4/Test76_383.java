package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_383 {
    private final Production76_383 production = new Production76_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}