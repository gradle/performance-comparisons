package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23862 {
    private final Productionnull_23862 production = new Productionnull_23862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}