package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42027 {
    private final Productionnull_42027 production = new Productionnull_42027("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}