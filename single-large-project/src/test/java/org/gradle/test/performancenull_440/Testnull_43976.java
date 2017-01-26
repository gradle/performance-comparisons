package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43976 {
    private final Productionnull_43976 production = new Productionnull_43976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}