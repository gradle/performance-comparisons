package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24139 {
    private final Productionnull_24139 production = new Productionnull_24139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}