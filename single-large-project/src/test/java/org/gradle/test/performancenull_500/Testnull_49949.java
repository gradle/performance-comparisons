package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49949 {
    private final Productionnull_49949 production = new Productionnull_49949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}