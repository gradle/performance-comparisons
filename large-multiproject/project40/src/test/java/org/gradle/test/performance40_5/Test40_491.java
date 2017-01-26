package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_491 {
    private final Production40_491 production = new Production40_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}