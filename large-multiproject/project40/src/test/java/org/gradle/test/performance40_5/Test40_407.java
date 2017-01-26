package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_407 {
    private final Production40_407 production = new Production40_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}