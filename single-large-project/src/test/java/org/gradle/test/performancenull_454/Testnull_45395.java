package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45395 {
    private final Productionnull_45395 production = new Productionnull_45395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}