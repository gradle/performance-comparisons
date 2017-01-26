package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47942 {
    private final Productionnull_47942 production = new Productionnull_47942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}