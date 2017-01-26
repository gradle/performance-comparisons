package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10293 {
    private final Productionnull_10293 production = new Productionnull_10293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}