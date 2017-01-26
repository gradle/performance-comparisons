package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38583 {
    private final Productionnull_38583 production = new Productionnull_38583("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}