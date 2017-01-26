package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19097 {
    private final Productionnull_19097 production = new Productionnull_19097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}