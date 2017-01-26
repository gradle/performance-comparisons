package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21382 {
    private final Productionnull_21382 production = new Productionnull_21382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}