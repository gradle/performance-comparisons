package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_125 {
    private final Production76_125 production = new Production76_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}