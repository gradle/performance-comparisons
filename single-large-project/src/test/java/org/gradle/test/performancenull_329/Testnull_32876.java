package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32876 {
    private final Productionnull_32876 production = new Productionnull_32876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}