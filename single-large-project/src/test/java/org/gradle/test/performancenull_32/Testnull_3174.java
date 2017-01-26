package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3174 {
    private final Productionnull_3174 production = new Productionnull_3174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}