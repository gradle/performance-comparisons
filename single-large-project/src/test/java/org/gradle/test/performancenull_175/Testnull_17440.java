package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17440 {
    private final Productionnull_17440 production = new Productionnull_17440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}