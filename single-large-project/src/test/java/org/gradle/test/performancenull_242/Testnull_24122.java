package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24122 {
    private final Productionnull_24122 production = new Productionnull_24122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}