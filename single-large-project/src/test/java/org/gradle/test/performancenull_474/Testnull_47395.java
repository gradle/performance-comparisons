package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47395 {
    private final Productionnull_47395 production = new Productionnull_47395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}