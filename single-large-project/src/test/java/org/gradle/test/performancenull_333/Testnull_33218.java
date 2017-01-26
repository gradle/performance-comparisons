package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33218 {
    private final Productionnull_33218 production = new Productionnull_33218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}