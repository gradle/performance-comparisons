package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21195 {
    private final Productionnull_21195 production = new Productionnull_21195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}