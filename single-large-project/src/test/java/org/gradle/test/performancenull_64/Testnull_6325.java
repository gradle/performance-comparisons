package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6325 {
    private final Productionnull_6325 production = new Productionnull_6325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}