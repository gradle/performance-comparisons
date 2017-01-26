package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12906 {
    private final Productionnull_12906 production = new Productionnull_12906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}