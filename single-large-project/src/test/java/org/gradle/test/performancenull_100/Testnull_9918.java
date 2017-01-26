package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9918 {
    private final Productionnull_9918 production = new Productionnull_9918("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}