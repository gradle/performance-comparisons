package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30239 {
    private final Productionnull_30239 production = new Productionnull_30239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}