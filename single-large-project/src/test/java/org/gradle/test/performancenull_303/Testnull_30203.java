package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30203 {
    private final Productionnull_30203 production = new Productionnull_30203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}