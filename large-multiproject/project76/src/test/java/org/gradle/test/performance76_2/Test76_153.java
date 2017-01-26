package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_153 {
    private final Production76_153 production = new Production76_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}