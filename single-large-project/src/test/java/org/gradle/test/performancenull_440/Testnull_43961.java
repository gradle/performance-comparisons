package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43961 {
    private final Productionnull_43961 production = new Productionnull_43961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}