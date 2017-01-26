package org.gradle.test.performancenull_159;

import static org.junit.Assert.*;

public class Testnull_15876 {
    private final Productionnull_15876 production = new Productionnull_15876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}