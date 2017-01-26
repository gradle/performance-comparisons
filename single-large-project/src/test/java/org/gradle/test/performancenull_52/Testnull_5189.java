package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5189 {
    private final Productionnull_5189 production = new Productionnull_5189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}