package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21058 {
    private final Productionnull_21058 production = new Productionnull_21058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}