package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7300 {
    private final Productionnull_7300 production = new Productionnull_7300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}