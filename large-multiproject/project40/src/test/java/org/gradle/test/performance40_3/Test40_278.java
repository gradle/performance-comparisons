package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_278 {
    private final Production40_278 production = new Production40_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}