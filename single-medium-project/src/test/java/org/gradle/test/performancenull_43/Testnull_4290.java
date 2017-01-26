package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4290 {
    private final Productionnull_4290 production = new Productionnull_4290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}