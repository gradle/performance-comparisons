package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35549 {
    private final Productionnull_35549 production = new Productionnull_35549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}