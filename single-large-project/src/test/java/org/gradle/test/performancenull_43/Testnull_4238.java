package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4238 {
    private final Productionnull_4238 production = new Productionnull_4238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}