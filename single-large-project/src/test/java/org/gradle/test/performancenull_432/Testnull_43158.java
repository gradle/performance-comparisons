package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43158 {
    private final Productionnull_43158 production = new Productionnull_43158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}