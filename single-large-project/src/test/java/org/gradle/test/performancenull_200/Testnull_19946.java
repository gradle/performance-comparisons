package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19946 {
    private final Productionnull_19946 production = new Productionnull_19946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}