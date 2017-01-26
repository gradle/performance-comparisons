package org.gradle.test.performancenull_106;

import static org.junit.Assert.*;

public class Testnull_10526 {
    private final Productionnull_10526 production = new Productionnull_10526("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}