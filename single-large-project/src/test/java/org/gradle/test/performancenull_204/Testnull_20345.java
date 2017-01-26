package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20345 {
    private final Productionnull_20345 production = new Productionnull_20345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}