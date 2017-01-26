package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30287 {
    private final Productionnull_30287 production = new Productionnull_30287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}