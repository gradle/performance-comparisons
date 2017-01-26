package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20061 {
    private final Productionnull_20061 production = new Productionnull_20061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}