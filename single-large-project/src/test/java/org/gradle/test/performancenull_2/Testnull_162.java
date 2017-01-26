package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_162 {
    private final Productionnull_162 production = new Productionnull_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}