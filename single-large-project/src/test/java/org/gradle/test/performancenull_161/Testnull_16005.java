package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16005 {
    private final Productionnull_16005 production = new Productionnull_16005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}