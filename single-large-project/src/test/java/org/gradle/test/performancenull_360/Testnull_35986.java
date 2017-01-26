package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35986 {
    private final Productionnull_35986 production = new Productionnull_35986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}