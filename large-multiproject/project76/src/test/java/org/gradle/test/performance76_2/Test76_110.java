package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_110 {
    private final Production76_110 production = new Production76_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}