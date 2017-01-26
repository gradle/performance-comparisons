package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4943 {
    private final Productionnull_4943 production = new Productionnull_4943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}