package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19916 {
    private final Productionnull_19916 production = new Productionnull_19916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}