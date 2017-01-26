package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40269 {
    private final Productionnull_40269 production = new Productionnull_40269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}