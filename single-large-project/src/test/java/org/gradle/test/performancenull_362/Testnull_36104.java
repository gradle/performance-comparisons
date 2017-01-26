package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36104 {
    private final Productionnull_36104 production = new Productionnull_36104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}