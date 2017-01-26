package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43145 {
    private final Productionnull_43145 production = new Productionnull_43145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}