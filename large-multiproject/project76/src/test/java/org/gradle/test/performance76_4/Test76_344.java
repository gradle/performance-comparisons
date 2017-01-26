package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_344 {
    private final Production76_344 production = new Production76_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}