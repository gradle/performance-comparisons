package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2500 {
    private final Productionnull_2500 production = new Productionnull_2500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}