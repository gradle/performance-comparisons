package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5073 {
    private final Productionnull_5073 production = new Productionnull_5073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}