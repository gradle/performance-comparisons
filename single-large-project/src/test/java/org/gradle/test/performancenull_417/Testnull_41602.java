package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41602 {
    private final Productionnull_41602 production = new Productionnull_41602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}