package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30978 {
    private final Productionnull_30978 production = new Productionnull_30978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}