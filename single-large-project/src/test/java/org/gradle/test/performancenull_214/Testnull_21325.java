package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21325 {
    private final Productionnull_21325 production = new Productionnull_21325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}