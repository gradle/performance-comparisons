package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17260 {
    private final Productionnull_17260 production = new Productionnull_17260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}