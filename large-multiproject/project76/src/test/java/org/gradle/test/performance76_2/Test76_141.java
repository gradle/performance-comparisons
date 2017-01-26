package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_141 {
    private final Production76_141 production = new Production76_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}