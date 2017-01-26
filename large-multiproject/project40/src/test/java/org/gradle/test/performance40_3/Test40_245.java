package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_245 {
    private final Production40_245 production = new Production40_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}