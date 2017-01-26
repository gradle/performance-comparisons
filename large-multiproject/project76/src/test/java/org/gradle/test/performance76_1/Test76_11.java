package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_11 {
    private final Production76_11 production = new Production76_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}