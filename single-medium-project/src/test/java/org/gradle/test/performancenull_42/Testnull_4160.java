package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4160 {
    private final Productionnull_4160 production = new Productionnull_4160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}