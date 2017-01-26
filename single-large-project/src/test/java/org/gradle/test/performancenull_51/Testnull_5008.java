package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5008 {
    private final Productionnull_5008 production = new Productionnull_5008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}