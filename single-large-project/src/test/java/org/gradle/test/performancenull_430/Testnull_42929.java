package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42929 {
    private final Productionnull_42929 production = new Productionnull_42929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}