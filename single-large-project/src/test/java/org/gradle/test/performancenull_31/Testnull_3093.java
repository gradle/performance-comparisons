package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3093 {
    private final Productionnull_3093 production = new Productionnull_3093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}