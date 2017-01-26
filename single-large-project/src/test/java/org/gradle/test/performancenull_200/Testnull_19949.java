package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19949 {
    private final Productionnull_19949 production = new Productionnull_19949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}