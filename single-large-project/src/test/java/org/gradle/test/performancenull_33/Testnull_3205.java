package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3205 {
    private final Productionnull_3205 production = new Productionnull_3205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}