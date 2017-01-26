package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33481 {
    private final Productionnull_33481 production = new Productionnull_33481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}