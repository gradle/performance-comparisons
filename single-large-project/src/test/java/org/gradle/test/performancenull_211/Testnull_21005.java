package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21005 {
    private final Productionnull_21005 production = new Productionnull_21005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}