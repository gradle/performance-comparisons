package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_118 {
    private final Production40_118 production = new Production40_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}