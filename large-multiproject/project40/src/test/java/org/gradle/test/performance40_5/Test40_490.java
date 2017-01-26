package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_490 {
    private final Production40_490 production = new Production40_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}