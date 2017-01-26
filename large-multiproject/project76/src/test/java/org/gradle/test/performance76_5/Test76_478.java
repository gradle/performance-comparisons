package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_478 {
    private final Production76_478 production = new Production76_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}