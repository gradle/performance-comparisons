package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_133 {
    private final Productionnull_133 production = new Productionnull_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}