package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43935 {
    private final Productionnull_43935 production = new Productionnull_43935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}