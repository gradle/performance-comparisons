package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17266 {
    private final Productionnull_17266 production = new Productionnull_17266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}