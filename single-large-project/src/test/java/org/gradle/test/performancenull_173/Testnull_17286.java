package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17286 {
    private final Productionnull_17286 production = new Productionnull_17286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}