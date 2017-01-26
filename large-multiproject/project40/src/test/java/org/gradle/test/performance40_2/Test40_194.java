package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_194 {
    private final Production40_194 production = new Production40_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}