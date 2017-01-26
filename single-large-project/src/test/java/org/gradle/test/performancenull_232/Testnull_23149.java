package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23149 {
    private final Productionnull_23149 production = new Productionnull_23149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}