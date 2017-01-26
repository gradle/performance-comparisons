package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36952 {
    private final Productionnull_36952 production = new Productionnull_36952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}