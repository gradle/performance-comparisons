package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8454 {
    private final Productionnull_8454 production = new Productionnull_8454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}