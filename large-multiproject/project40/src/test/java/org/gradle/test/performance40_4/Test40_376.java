package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_376 {
    private final Production40_376 production = new Production40_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}