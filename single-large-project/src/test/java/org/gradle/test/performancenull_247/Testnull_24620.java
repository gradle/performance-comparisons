package org.gradle.test.performancenull_247;

import static org.junit.Assert.*;

public class Testnull_24620 {
    private final Productionnull_24620 production = new Productionnull_24620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}