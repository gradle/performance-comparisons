package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23075 {
    private final Productionnull_23075 production = new Productionnull_23075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}