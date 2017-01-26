package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_327 {
    private final Production40_327 production = new Production40_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}