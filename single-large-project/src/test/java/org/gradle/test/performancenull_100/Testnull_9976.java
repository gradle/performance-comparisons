package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9976 {
    private final Productionnull_9976 production = new Productionnull_9976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}