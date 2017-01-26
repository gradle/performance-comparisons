package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39971 {
    private final Productionnull_39971 production = new Productionnull_39971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}