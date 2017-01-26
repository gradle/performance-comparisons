package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43492 {
    private final Productionnull_43492 production = new Productionnull_43492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}