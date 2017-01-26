package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_20 {
    private final Production40_20 production = new Production40_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}