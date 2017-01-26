package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5500 {
    private final Productionnull_5500 production = new Productionnull_5500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}