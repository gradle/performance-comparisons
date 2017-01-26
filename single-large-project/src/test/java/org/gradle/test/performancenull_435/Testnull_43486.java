package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43486 {
    private final Productionnull_43486 production = new Productionnull_43486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}