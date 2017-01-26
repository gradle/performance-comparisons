package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10248 {
    private final Productionnull_10248 production = new Productionnull_10248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}