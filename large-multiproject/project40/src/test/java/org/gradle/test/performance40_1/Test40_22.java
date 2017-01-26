package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_22 {
    private final Production40_22 production = new Production40_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}