package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_402 {
    private final Production76_402 production = new Production76_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}