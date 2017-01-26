package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33475 {
    private final Productionnull_33475 production = new Productionnull_33475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}