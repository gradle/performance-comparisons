package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43778 {
    private final Productionnull_43778 production = new Productionnull_43778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}