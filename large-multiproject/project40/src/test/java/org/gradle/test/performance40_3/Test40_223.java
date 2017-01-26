package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_223 {
    private final Production40_223 production = new Production40_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}