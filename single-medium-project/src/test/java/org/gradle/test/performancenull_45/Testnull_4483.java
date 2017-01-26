package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4483 {
    private final Productionnull_4483 production = new Productionnull_4483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}