package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30195 {
    private final Productionnull_30195 production = new Productionnull_30195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}