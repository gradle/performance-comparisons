package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3379 {
    private final Productionnull_3379 production = new Productionnull_3379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}