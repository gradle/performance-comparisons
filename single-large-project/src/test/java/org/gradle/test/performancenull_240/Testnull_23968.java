package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23968 {
    private final Productionnull_23968 production = new Productionnull_23968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}