package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43176 {
    private final Productionnull_43176 production = new Productionnull_43176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}