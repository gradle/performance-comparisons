package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21778 {
    private final Productionnull_21778 production = new Productionnull_21778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}