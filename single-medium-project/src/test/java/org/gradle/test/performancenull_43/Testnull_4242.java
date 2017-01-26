package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4242 {
    private final Productionnull_4242 production = new Productionnull_4242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}