package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_430 {
    private final Production98_430 production = new Production98_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}