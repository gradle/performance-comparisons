package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_433 {
    private final Production40_433 production = new Production40_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}