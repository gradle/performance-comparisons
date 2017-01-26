package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_279 {
    private final Production40_279 production = new Production40_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}