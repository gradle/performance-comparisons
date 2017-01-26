package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31172 {
    private final Productionnull_31172 production = new Productionnull_31172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}