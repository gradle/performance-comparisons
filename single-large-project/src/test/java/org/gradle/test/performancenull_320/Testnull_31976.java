package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31976 {
    private final Productionnull_31976 production = new Productionnull_31976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}