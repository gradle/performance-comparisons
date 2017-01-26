package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20399 {
    private final Productionnull_20399 production = new Productionnull_20399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}