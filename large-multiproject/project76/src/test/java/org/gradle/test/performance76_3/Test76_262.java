package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_262 {
    private final Production76_262 production = new Production76_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}