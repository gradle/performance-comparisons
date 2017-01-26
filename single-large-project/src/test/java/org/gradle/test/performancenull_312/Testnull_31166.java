package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31166 {
    private final Productionnull_31166 production = new Productionnull_31166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}