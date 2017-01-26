package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21133 {
    private final Productionnull_21133 production = new Productionnull_21133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}