package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_160 {
    private final Production76_160 production = new Production76_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}