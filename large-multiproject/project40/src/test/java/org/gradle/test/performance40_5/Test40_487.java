package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_487 {
    private final Production40_487 production = new Production40_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}