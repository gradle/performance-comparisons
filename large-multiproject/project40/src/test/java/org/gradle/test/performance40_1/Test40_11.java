package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_11 {
    private final Production40_11 production = new Production40_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}