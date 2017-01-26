package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3465 {
    private final Productionnull_3465 production = new Productionnull_3465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}