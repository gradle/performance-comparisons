package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_352 {
    private final Production40_352 production = new Production40_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}