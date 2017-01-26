package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_355 {
    private final Production40_355 production = new Production40_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}