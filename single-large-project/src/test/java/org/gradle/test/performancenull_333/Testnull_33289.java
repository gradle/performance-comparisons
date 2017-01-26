package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33289 {
    private final Productionnull_33289 production = new Productionnull_33289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}