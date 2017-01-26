package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21061 {
    private final Productionnull_21061 production = new Productionnull_21061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}