package org.gradle.test.performancenull_222;

import static org.junit.Assert.*;

public class Testnull_22190 {
    private final Productionnull_22190 production = new Productionnull_22190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}