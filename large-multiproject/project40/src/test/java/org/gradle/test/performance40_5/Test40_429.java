package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_429 {
    private final Production40_429 production = new Production40_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}