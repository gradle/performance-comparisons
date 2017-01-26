package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_141 {
    private final Production40_141 production = new Production40_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}