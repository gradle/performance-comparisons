package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_333 {
    private final Production76_333 production = new Production76_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}