package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_19000 {
    private final Productionnull_19000 production = new Productionnull_19000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}