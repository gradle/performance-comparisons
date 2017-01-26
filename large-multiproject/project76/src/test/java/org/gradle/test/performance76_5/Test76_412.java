package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_412 {
    private final Production76_412 production = new Production76_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}