package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_125 {
    private final Production40_125 production = new Production40_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}