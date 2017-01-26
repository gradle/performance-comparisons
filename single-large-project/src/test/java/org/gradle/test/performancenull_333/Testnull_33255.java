package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33255 {
    private final Productionnull_33255 production = new Productionnull_33255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}