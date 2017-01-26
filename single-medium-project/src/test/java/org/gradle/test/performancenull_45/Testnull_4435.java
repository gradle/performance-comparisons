package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4435 {
    private final Productionnull_4435 production = new Productionnull_4435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}