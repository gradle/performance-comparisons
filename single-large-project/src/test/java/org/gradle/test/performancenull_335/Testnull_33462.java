package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33462 {
    private final Productionnull_33462 production = new Productionnull_33462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}