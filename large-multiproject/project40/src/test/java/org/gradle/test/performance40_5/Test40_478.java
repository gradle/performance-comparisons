package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_478 {
    private final Production40_478 production = new Production40_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}