package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10370 {
    private final Productionnull_10370 production = new Productionnull_10370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}