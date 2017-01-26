package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_128 {
    private final Production76_128 production = new Production76_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}