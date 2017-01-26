package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_490 {
    private final Production76_490 production = new Production76_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}