package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49934 {
    private final Productionnull_49934 production = new Productionnull_49934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}