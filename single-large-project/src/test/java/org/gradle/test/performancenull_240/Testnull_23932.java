package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23932 {
    private final Productionnull_23932 production = new Productionnull_23932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}