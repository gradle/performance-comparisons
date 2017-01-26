package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_117 {
    private final Production8_117 production = new Production8_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}