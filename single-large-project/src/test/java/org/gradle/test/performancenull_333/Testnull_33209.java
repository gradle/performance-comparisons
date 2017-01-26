package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33209 {
    private final Productionnull_33209 production = new Productionnull_33209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}