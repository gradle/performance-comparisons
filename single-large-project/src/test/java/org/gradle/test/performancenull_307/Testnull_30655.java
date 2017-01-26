package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30655 {
    private final Productionnull_30655 production = new Productionnull_30655("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}