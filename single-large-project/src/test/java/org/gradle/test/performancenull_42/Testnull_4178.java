package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4178 {
    private final Productionnull_4178 production = new Productionnull_4178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}