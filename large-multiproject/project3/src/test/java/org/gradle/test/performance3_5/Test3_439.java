package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_439 {
    private final Production3_439 production = new Production3_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}