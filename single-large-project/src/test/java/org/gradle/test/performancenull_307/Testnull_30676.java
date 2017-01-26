package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30676 {
    private final Productionnull_30676 production = new Productionnull_30676("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}