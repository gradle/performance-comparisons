package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23620 {
    private final Productionnull_23620 production = new Productionnull_23620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}