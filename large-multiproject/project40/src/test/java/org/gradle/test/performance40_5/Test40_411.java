package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_411 {
    private final Production40_411 production = new Production40_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}