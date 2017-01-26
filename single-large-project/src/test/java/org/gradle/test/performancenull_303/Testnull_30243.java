package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30243 {
    private final Productionnull_30243 production = new Productionnull_30243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}