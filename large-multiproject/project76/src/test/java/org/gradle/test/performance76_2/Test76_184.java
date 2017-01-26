package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_184 {
    private final Production76_184 production = new Production76_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}