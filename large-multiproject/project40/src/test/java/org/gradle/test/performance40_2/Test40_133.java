package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_133 {
    private final Production40_133 production = new Production40_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}