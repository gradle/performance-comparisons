package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4228 {
    private final Productionnull_4228 production = new Productionnull_4228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}