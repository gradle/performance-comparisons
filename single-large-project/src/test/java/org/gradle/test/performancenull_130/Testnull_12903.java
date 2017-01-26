package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12903 {
    private final Productionnull_12903 production = new Productionnull_12903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}