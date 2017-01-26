package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_50 {
    private final Production40_50 production = new Production40_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}