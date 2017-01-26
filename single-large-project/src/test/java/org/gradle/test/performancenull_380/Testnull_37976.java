package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37976 {
    private final Productionnull_37976 production = new Productionnull_37976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}