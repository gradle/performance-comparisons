package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40271 {
    private final Productionnull_40271 production = new Productionnull_40271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}