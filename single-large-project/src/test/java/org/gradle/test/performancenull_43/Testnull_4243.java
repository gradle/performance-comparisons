package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4243 {
    private final Productionnull_4243 production = new Productionnull_4243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}