package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24175 {
    private final Productionnull_24175 production = new Productionnull_24175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}