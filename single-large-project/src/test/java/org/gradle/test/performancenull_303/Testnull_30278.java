package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30278 {
    private final Productionnull_30278 production = new Productionnull_30278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}