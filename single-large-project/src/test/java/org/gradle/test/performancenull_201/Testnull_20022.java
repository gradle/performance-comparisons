package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20022 {
    private final Productionnull_20022 production = new Productionnull_20022("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}