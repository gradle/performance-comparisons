package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_197 {
    private final Production76_197 production = new Production76_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}