package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4221 {
    private final Productionnull_4221 production = new Productionnull_4221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}