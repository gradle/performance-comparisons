package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30491 {
    private final Productionnull_30491 production = new Productionnull_30491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}