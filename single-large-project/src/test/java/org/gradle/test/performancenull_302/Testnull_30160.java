package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30160 {
    private final Productionnull_30160 production = new Productionnull_30160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}