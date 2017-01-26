package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_344 {
    private final Production40_344 production = new Production40_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}