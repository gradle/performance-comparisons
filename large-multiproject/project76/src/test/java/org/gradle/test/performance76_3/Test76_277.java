package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_277 {
    private final Production76_277 production = new Production76_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}