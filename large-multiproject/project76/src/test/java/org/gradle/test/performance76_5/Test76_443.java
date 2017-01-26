package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_443 {
    private final Production76_443 production = new Production76_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}