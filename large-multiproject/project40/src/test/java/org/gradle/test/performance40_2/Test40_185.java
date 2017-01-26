package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_185 {
    private final Production40_185 production = new Production40_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}