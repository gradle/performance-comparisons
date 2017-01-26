package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43153 {
    private final Productionnull_43153 production = new Productionnull_43153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}