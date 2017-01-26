package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_233 {
    private final Production40_233 production = new Production40_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}