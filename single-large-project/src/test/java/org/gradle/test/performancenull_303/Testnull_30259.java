package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30259 {
    private final Productionnull_30259 production = new Productionnull_30259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}