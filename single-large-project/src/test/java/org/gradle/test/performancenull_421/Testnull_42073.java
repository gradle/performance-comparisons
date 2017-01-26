package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42073 {
    private final Productionnull_42073 production = new Productionnull_42073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}