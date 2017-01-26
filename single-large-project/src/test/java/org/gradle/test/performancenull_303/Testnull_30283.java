package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30283 {
    private final Productionnull_30283 production = new Productionnull_30283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}