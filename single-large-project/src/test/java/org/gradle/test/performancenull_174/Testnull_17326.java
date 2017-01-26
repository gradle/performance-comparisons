package org.gradle.test.performancenull_174;

import static org.junit.Assert.*;

public class Testnull_17326 {
    private final Productionnull_17326 production = new Productionnull_17326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}