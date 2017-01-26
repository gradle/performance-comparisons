package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43179 {
    private final Productionnull_43179 production = new Productionnull_43179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}