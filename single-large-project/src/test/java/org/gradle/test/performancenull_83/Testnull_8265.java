package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8265 {
    private final Productionnull_8265 production = new Productionnull_8265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}