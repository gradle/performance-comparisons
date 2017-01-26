package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43129 {
    private final Productionnull_43129 production = new Productionnull_43129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}