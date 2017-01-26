package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40102 {
    private final Productionnull_40102 production = new Productionnull_40102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}