package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3500 {
    private final Productionnull_3500 production = new Productionnull_3500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}