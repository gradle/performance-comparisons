package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_50 {
    private final Production76_50 production = new Production76_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}