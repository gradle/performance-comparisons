package org.gradle.test.performancenull_109;

import static org.junit.Assert.*;

public class Testnull_10843 {
    private final Productionnull_10843 production = new Productionnull_10843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}