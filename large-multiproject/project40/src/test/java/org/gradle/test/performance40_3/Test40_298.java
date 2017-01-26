package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_298 {
    private final Production40_298 production = new Production40_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}