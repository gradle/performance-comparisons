package org.gradle.test.performancenull_304;

import static org.junit.Assert.*;

public class Testnull_30373 {
    private final Productionnull_30373 production = new Productionnull_30373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}