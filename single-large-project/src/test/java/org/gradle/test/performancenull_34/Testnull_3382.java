package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3382 {
    private final Productionnull_3382 production = new Productionnull_3382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}