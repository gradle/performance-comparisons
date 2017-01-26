package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_159 {
    private final Production40_159 production = new Production40_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}