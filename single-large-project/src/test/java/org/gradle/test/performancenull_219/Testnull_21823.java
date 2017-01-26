package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21823 {
    private final Productionnull_21823 production = new Productionnull_21823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}