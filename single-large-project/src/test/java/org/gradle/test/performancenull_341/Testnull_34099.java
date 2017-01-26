package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34099 {
    private final Productionnull_34099 production = new Productionnull_34099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}