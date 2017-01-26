package org.gradle.test.performancenull_441;

import static org.junit.Assert.*;

public class Testnull_44095 {
    private final Productionnull_44095 production = new Productionnull_44095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}