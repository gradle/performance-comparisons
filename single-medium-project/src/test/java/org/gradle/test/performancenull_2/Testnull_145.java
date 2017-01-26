package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_145 {
    private final Productionnull_145 production = new Productionnull_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}