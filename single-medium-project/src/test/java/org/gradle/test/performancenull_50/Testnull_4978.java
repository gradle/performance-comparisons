package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4978 {
    private final Productionnull_4978 production = new Productionnull_4978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}