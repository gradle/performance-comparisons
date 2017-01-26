package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43491 {
    private final Productionnull_43491 production = new Productionnull_43491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}