package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_285 {
    private final Production40_285 production = new Production40_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}