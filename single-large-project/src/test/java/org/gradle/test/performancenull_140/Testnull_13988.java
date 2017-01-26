package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13988 {
    private final Productionnull_13988 production = new Productionnull_13988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}