package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42162 {
    private final Productionnull_42162 production = new Productionnull_42162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}