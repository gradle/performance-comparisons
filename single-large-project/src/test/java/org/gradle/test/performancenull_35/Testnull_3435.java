package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3435 {
    private final Productionnull_3435 production = new Productionnull_3435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}