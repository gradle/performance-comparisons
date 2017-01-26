package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7491 {
    private final Productionnull_7491 production = new Productionnull_7491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}