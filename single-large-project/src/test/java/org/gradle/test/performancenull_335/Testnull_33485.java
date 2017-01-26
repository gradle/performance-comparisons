package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33485 {
    private final Productionnull_33485 production = new Productionnull_33485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}