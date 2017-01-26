package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6349 {
    private final Productionnull_6349 production = new Productionnull_6349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}