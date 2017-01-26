package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4876 {
    private final Productionnull_4876 production = new Productionnull_4876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}