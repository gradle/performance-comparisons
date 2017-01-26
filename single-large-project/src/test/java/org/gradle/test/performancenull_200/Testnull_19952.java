package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19952 {
    private final Productionnull_19952 production = new Productionnull_19952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}