package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_250 {
    private final Production40_250 production = new Production40_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}