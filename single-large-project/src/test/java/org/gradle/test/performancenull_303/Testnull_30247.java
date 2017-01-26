package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30247 {
    private final Productionnull_30247 production = new Productionnull_30247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}