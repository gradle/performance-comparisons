package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1099 {
    private final Productionnull_1099 production = new Productionnull_1099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}