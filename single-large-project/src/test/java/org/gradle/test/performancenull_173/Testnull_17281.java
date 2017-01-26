package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17281 {
    private final Productionnull_17281 production = new Productionnull_17281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}