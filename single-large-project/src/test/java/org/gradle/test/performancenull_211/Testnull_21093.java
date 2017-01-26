package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21093 {
    private final Productionnull_21093 production = new Productionnull_21093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}