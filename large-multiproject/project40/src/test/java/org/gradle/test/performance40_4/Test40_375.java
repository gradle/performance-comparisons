package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_375 {
    private final Production40_375 production = new Production40_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}