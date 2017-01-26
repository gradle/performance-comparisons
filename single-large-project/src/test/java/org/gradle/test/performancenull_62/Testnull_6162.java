package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6162 {
    private final Productionnull_6162 production = new Productionnull_6162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}