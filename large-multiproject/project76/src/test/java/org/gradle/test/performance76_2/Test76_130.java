package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_130 {
    private final Production76_130 production = new Production76_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}