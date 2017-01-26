package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2145 {
    private final Productionnull_2145 production = new Productionnull_2145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}