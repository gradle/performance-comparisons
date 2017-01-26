package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_389 {
    private final Production40_389 production = new Production40_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}