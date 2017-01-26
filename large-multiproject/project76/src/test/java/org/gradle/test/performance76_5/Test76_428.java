package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_428 {
    private final Production76_428 production = new Production76_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}