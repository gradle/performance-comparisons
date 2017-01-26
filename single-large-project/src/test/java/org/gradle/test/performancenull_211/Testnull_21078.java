package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21078 {
    private final Productionnull_21078 production = new Productionnull_21078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}