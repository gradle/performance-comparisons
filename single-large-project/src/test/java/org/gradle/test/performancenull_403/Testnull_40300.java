package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40300 {
    private final Productionnull_40300 production = new Productionnull_40300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}