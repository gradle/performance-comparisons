package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7268 {
    private final Productionnull_7268 production = new Productionnull_7268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}