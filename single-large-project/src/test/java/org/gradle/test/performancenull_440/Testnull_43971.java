package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43971 {
    private final Productionnull_43971 production = new Productionnull_43971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}