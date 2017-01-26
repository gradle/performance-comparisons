package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_140 {
    private final Productionnull_140 production = new Productionnull_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}