package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43132 {
    private final Productionnull_43132 production = new Productionnull_43132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}