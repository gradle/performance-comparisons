package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24946 {
    private final Productionnull_24946 production = new Productionnull_24946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}