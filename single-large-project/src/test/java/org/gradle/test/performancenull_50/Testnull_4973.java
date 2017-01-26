package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4973 {
    private final Productionnull_4973 production = new Productionnull_4973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}