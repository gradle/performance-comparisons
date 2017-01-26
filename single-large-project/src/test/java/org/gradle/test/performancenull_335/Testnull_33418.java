package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33418 {
    private final Productionnull_33418 production = new Productionnull_33418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}