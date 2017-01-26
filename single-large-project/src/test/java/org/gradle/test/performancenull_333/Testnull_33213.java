package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33213 {
    private final Productionnull_33213 production = new Productionnull_33213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}