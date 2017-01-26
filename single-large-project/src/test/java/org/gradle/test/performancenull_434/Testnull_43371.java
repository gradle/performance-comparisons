package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43371 {
    private final Productionnull_43371 production = new Productionnull_43371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}