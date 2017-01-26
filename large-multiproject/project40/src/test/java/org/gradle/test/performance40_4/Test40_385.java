package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_385 {
    private final Production40_385 production = new Production40_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}