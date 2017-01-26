package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_359 {
    private final Production40_359 production = new Production40_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}