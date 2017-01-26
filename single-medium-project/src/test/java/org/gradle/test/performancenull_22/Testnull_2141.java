package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2141 {
    private final Productionnull_2141 production = new Productionnull_2141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}