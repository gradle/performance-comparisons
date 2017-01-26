package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_335 {
    private final Production76_335 production = new Production76_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}