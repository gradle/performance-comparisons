package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2434 {
    private final Productionnull_2434 production = new Productionnull_2434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}