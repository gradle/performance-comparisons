package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20162 {
    private final Productionnull_20162 production = new Productionnull_20162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}