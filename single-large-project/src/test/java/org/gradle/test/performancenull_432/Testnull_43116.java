package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43116 {
    private final Productionnull_43116 production = new Productionnull_43116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}