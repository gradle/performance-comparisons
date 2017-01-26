package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_443 {
    private final Production40_443 production = new Production40_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}