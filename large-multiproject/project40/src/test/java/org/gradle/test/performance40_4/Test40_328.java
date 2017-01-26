package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_328 {
    private final Production40_328 production = new Production40_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}