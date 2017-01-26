package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_2000 {
    private final Productionnull_2000 production = new Productionnull_2000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}