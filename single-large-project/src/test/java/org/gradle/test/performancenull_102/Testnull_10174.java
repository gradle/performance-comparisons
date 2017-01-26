package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10174 {
    private final Productionnull_10174 production = new Productionnull_10174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}