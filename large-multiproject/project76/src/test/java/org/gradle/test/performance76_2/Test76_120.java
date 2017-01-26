package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_120 {
    private final Production76_120 production = new Production76_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}