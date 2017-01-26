package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33435 {
    private final Productionnull_33435 production = new Productionnull_33435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}