package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_430 {
    private final Production40_430 production = new Production40_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}