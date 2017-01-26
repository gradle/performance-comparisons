package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33490 {
    private final Productionnull_33490 production = new Productionnull_33490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}