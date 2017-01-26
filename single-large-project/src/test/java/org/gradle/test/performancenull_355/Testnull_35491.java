package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35491 {
    private final Productionnull_35491 production = new Productionnull_35491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}