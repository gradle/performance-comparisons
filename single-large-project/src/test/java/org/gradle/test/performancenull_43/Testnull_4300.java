package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4300 {
    private final Productionnull_4300 production = new Productionnull_4300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}