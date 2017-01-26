package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21326 {
    private final Productionnull_21326 production = new Productionnull_21326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}