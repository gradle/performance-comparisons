package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2395 {
    private final Productionnull_2395 production = new Productionnull_2395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}