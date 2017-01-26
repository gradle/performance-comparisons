package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20339 {
    private final Productionnull_20339 production = new Productionnull_20339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}