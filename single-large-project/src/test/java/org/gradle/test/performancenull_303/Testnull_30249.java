package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30249 {
    private final Productionnull_30249 production = new Productionnull_30249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}