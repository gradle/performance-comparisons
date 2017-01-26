package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30649 {
    private final Productionnull_30649 production = new Productionnull_30649("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}