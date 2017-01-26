package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23398 {
    private final Productionnull_23398 production = new Productionnull_23398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}