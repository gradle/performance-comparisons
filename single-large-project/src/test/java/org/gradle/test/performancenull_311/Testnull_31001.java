package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31001 {
    private final Productionnull_31001 production = new Productionnull_31001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}