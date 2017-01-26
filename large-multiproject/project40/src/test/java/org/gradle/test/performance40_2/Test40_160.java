package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_160 {
    private final Production40_160 production = new Production40_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}