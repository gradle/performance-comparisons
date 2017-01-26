package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_499 {
    private final Production40_499 production = new Production40_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}