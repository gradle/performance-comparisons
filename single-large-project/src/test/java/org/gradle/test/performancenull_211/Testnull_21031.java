package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21031 {
    private final Productionnull_21031 production = new Productionnull_21031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}