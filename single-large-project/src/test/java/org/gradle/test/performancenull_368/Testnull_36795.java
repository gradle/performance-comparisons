package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36795 {
    private final Productionnull_36795 production = new Productionnull_36795("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}