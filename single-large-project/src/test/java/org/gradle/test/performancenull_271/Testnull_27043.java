package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27043 {
    private final Productionnull_27043 production = new Productionnull_27043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}