package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30197 {
    private final Productionnull_30197 production = new Productionnull_30197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}