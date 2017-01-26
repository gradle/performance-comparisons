package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_120 {
    private final Production40_120 production = new Production40_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}