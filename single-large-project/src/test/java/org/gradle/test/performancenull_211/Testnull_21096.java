package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21096 {
    private final Productionnull_21096 production = new Productionnull_21096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}