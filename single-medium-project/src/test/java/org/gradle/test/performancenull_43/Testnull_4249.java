package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4249 {
    private final Productionnull_4249 production = new Productionnull_4249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}