package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20475 {
    private final Productionnull_20475 production = new Productionnull_20475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}