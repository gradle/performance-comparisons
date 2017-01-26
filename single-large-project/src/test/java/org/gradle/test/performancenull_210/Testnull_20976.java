package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20976 {
    private final Productionnull_20976 production = new Productionnull_20976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}