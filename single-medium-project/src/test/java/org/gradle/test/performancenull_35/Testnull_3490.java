package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3490 {
    private final Productionnull_3490 production = new Productionnull_3490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}