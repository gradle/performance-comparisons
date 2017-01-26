package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_144 {
    private final Production76_144 production = new Production76_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}