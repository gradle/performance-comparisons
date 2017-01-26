package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4205 {
    private final Productionnull_4205 production = new Productionnull_4205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}