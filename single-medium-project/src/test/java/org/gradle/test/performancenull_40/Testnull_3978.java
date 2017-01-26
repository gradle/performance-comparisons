package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3978 {
    private final Productionnull_3978 production = new Productionnull_3978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}