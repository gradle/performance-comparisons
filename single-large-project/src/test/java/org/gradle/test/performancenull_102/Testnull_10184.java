package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10184 {
    private final Productionnull_10184 production = new Productionnull_10184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}