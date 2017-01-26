package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23174 {
    private final Productionnull_23174 production = new Productionnull_23174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}