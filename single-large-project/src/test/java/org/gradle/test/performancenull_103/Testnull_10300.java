package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10300 {
    private final Productionnull_10300 production = new Productionnull_10300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}