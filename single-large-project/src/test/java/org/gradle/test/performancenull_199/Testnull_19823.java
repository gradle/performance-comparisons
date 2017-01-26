package org.gradle.test.performancenull_199;

import static org.junit.Assert.*;

public class Testnull_19823 {
    private final Productionnull_19823 production = new Productionnull_19823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}