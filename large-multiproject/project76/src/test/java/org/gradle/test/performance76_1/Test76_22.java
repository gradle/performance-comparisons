package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_22 {
    private final Production76_22 production = new Production76_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}