package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42295 {
    private final Productionnull_42295 production = new Productionnull_42295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}