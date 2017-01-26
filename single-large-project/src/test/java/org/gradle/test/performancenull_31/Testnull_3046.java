package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3046 {
    private final Productionnull_3046 production = new Productionnull_3046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}