package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_153 {
    private final Production40_153 production = new Production40_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}