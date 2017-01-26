package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24179 {
    private final Productionnull_24179 production = new Productionnull_24179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}