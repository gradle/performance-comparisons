package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_312 {
    private final Production40_312 production = new Production40_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}