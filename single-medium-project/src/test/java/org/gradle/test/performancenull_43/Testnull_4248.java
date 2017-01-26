package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4248 {
    private final Productionnull_4248 production = new Productionnull_4248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}