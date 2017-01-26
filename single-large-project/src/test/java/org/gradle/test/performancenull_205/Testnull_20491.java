package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20491 {
    private final Productionnull_20491 production = new Productionnull_20491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}