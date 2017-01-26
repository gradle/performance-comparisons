package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19098 {
    private final Productionnull_19098 production = new Productionnull_19098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}