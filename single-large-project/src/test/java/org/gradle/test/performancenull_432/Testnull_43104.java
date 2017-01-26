package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43104 {
    private final Productionnull_43104 production = new Productionnull_43104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}