package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_292 {
    private final Production76_292 production = new Production76_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}