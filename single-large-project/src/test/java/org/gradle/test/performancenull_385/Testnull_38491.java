package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38491 {
    private final Productionnull_38491 production = new Productionnull_38491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}