package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1976 {
    private final Productionnull_1976 production = new Productionnull_1976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}