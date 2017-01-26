package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21085 {
    private final Productionnull_21085 production = new Productionnull_21085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}