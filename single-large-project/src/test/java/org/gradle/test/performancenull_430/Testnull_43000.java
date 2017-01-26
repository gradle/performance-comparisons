package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_43000 {
    private final Productionnull_43000 production = new Productionnull_43000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}