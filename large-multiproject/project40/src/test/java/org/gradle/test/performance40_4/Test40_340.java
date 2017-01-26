package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_340 {
    private final Production40_340 production = new Production40_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}