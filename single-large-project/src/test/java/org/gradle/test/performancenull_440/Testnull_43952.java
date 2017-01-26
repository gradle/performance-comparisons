package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43952 {
    private final Productionnull_43952 production = new Productionnull_43952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}