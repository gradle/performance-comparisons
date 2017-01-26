package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_372 {
    private final Production40_372 production = new Production40_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}