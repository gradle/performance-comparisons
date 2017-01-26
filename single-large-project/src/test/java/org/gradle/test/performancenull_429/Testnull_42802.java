package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42802 {
    private final Productionnull_42802 production = new Productionnull_42802("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}