package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_332 {
    private final Production40_332 production = new Production40_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}