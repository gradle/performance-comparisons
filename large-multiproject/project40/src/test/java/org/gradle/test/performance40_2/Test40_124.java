package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_124 {
    private final Production40_124 production = new Production40_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}