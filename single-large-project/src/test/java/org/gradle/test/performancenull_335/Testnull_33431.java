package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33431 {
    private final Productionnull_33431 production = new Productionnull_33431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}