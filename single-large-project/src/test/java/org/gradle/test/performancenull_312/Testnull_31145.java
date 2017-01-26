package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31145 {
    private final Productionnull_31145 production = new Productionnull_31145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}