package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_299 {
    private final Production40_299 production = new Production40_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}