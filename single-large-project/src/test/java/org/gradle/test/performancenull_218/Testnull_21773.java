package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21773 {
    private final Productionnull_21773 production = new Productionnull_21773("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}