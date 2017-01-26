package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_483 {
    private final Production40_483 production = new Production40_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}