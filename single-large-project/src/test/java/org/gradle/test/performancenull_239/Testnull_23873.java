package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23873 {
    private final Productionnull_23873 production = new Productionnull_23873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}