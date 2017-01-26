package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2379 {
    private final Productionnull_2379 production = new Productionnull_2379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}