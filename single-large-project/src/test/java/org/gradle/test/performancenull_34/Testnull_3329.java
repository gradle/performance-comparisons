package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3329 {
    private final Productionnull_3329 production = new Productionnull_3329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}