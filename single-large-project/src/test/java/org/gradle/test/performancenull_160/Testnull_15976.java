package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15976 {
    private final Productionnull_15976 production = new Productionnull_15976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}