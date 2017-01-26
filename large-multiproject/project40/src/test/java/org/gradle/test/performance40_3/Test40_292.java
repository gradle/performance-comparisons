package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_292 {
    private final Production40_292 production = new Production40_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}