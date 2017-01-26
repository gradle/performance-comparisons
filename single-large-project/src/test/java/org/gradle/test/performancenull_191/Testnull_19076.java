package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19076 {
    private final Productionnull_19076 production = new Productionnull_19076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}