package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17976 {
    private final Productionnull_17976 production = new Productionnull_17976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}