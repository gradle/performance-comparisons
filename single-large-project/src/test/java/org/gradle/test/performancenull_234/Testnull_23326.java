package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23326 {
    private final Productionnull_23326 production = new Productionnull_23326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}