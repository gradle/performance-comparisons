package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21172 {
    private final Productionnull_21172 production = new Productionnull_21172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}