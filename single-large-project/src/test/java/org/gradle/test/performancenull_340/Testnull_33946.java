package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33946 {
    private final Productionnull_33946 production = new Productionnull_33946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}