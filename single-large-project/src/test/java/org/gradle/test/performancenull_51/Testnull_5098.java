package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5098 {
    private final Productionnull_5098 production = new Productionnull_5098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}