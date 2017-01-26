package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10942 {
    private final Productionnull_10942 production = new Productionnull_10942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}