package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_439 {
    private final Production8_439 production = new Production8_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}