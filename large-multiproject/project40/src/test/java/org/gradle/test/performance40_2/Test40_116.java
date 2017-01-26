package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_116 {
    private final Production40_116 production = new Production40_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}