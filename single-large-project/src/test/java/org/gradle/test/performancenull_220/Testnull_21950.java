package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21950 {
    private final Productionnull_21950 production = new Productionnull_21950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}