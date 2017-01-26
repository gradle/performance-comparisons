package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19929 {
    private final Productionnull_19929 production = new Productionnull_19929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}