package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8976 {
    private final Productionnull_8976 production = new Productionnull_8976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}