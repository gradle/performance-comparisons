package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_448 {
    private final Production40_448 production = new Production40_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}