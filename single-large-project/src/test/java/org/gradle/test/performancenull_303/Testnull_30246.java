package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30246 {
    private final Productionnull_30246 production = new Productionnull_30246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}