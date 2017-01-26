package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_101 {
    private final Production76_101 production = new Production76_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}