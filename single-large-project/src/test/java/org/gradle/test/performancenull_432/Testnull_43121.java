package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43121 {
    private final Productionnull_43121 production = new Productionnull_43121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}