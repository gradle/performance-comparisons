package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36326 {
    private final Productionnull_36326 production = new Productionnull_36326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}