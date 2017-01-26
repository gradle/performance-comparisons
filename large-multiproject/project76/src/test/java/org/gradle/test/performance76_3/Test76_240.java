package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_240 {
    private final Production76_240 production = new Production76_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}