package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17910 {
    private final Productionnull_17910 production = new Productionnull_17910("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}