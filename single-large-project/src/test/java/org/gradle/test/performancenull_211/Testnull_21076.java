package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21076 {
    private final Productionnull_21076 production = new Productionnull_21076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}