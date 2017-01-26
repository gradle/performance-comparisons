package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32976 {
    private final Productionnull_32976 production = new Productionnull_32976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}