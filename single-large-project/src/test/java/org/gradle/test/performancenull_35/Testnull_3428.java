package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3428 {
    private final Productionnull_3428 production = new Productionnull_3428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}