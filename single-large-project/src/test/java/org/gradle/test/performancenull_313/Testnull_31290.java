package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31290 {
    private final Productionnull_31290 production = new Productionnull_31290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}