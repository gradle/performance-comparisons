package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43928 {
    private final Productionnull_43928 production = new Productionnull_43928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}