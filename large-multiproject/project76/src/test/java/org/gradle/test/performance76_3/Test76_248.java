package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_248 {
    private final Production76_248 production = new Production76_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}