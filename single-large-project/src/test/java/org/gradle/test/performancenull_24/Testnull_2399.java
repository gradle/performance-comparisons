package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2399 {
    private final Productionnull_2399 production = new Productionnull_2399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}