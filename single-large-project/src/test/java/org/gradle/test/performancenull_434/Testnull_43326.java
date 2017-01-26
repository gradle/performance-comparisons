package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43326 {
    private final Productionnull_43326 production = new Productionnull_43326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}