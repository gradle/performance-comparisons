package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_262 {
    private final Production8_262 production = new Production8_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}