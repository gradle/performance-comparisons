package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_408 {
    private final Production76_408 production = new Production76_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}