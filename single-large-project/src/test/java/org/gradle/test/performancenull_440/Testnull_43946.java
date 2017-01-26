package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43946 {
    private final Productionnull_43946 production = new Productionnull_43946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}