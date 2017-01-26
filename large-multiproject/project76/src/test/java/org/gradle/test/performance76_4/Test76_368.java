package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_368 {
    private final Production76_368 production = new Production76_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}