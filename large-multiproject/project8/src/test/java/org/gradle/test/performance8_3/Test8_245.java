package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_245 {
    private final Production8_245 production = new Production8_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}