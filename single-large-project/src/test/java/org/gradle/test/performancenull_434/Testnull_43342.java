package org.gradle.test.performancenull_434;

import static org.junit.Assert.*;

public class Testnull_43342 {
    private final Productionnull_43342 production = new Productionnull_43342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}