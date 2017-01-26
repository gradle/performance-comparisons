package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_454 {
    private final Production76_454 production = new Production76_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}