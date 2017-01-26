package org.gradle.test.performancenull_289;

import static org.junit.Assert.*;

public class Testnull_28876 {
    private final Productionnull_28876 production = new Productionnull_28876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}