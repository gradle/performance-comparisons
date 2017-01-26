package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2916 {
    private final Productionnull_2916 production = new Productionnull_2916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}