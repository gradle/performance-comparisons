package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12462 {
    private final Productionnull_12462 production = new Productionnull_12462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}