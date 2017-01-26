package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33471 {
    private final Productionnull_33471 production = new Productionnull_33471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}