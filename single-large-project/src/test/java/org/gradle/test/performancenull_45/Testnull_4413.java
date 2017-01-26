package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4413 {
    private final Productionnull_4413 production = new Productionnull_4413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}