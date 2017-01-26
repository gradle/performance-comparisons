package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12468 {
    private final Productionnull_12468 production = new Productionnull_12468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}