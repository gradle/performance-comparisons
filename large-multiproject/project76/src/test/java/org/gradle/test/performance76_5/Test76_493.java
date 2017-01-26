package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_493 {
    private final Production76_493 production = new Production76_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}