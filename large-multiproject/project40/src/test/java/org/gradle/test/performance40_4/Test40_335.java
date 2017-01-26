package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_335 {
    private final Production40_335 production = new Production40_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}