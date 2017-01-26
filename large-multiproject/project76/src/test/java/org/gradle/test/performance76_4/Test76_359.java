package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_359 {
    private final Production76_359 production = new Production76_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}