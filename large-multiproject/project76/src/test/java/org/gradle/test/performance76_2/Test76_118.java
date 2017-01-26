package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_118 {
    private final Production76_118 production = new Production76_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}