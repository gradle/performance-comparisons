package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35500 {
    private final Productionnull_35500 production = new Productionnull_35500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}