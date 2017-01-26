package org.gradle.test.performancenull_109;

import static org.junit.Assert.*;

public class Testnull_10823 {
    private final Productionnull_10823 production = new Productionnull_10823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}