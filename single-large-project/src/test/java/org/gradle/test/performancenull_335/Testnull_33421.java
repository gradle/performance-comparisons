package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33421 {
    private final Productionnull_33421 production = new Productionnull_33421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}