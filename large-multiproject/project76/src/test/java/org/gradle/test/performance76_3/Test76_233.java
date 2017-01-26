package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_233 {
    private final Production76_233 production = new Production76_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}