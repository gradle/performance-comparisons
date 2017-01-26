package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12095 {
    private final Productionnull_12095 production = new Productionnull_12095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}