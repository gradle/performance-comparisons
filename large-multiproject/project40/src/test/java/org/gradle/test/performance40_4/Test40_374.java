package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_374 {
    private final Production40_374 production = new Production40_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}