package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33220 {
    private final Productionnull_33220 production = new Productionnull_33220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}