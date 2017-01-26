package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33297 {
    private final Productionnull_33297 production = new Productionnull_33297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}