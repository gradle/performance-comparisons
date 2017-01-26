package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33482 {
    private final Productionnull_33482 production = new Productionnull_33482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}