package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_453 {
    private final Production40_453 production = new Production40_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}