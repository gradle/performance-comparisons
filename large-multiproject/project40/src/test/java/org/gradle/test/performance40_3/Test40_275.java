package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_275 {
    private final Production40_275 production = new Production40_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}