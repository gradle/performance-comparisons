package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37876 {
    private final Productionnull_37876 production = new Productionnull_37876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}