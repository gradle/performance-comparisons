package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_211 {
    private final Production76_211 production = new Production76_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}