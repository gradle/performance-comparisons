package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_448 {
    private final Production76_448 production = new Production76_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}