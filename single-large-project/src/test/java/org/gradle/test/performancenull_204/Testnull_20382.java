package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20382 {
    private final Productionnull_20382 production = new Productionnull_20382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}