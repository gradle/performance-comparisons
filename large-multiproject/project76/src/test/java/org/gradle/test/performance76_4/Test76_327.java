package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_327 {
    private final Production76_327 production = new Production76_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}