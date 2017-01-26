package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21077 {
    private final Productionnull_21077 production = new Productionnull_21077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}