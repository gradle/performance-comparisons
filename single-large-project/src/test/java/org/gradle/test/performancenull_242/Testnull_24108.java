package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24108 {
    private final Productionnull_24108 production = new Productionnull_24108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}