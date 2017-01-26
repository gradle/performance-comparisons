package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33291 {
    private final Productionnull_33291 production = new Productionnull_33291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}