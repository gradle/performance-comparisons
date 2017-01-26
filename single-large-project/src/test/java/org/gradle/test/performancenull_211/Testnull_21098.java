package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21098 {
    private final Productionnull_21098 production = new Productionnull_21098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}