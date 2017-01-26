package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13981 {
    private final Productionnull_13981 production = new Productionnull_13981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}