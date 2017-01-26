package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_21 {
    private final Production76_21 production = new Production76_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}