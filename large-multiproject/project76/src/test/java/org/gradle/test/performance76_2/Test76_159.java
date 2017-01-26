package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_159 {
    private final Production76_159 production = new Production76_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}