package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6399 {
    private final Productionnull_6399 production = new Productionnull_6399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}