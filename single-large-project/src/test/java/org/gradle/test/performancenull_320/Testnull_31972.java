package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31972 {
    private final Productionnull_31972 production = new Productionnull_31972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}