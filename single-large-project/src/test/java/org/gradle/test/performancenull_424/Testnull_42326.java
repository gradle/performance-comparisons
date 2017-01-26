package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42326 {
    private final Productionnull_42326 production = new Productionnull_42326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}