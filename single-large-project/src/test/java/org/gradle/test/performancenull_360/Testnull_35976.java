package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35976 {
    private final Productionnull_35976 production = new Productionnull_35976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}