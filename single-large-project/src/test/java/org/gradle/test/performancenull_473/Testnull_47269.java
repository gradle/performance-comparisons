package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47269 {
    private final Productionnull_47269 production = new Productionnull_47269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}