package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2972 {
    private final Productionnull_2972 production = new Productionnull_2972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}