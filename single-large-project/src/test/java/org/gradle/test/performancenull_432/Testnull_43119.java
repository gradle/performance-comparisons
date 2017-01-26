package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43119 {
    private final Productionnull_43119 production = new Productionnull_43119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}