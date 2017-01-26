package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43972 {
    private final Productionnull_43972 production = new Productionnull_43972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}