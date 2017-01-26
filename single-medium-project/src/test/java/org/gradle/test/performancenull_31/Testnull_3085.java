package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3085 {
    private final Productionnull_3085 production = new Productionnull_3085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}