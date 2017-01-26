package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12683 {
    private final Productionnull_12683 production = new Productionnull_12683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}