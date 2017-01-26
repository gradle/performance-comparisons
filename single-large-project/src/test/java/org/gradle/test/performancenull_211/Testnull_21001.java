package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21001 {
    private final Productionnull_21001 production = new Productionnull_21001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}