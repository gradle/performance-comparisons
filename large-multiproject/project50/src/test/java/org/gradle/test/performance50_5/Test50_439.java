package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_439 {
    private final Production50_439 production = new Production50_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}