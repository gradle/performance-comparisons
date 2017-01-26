package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18265 {
    private final Productionnull_18265 production = new Productionnull_18265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}