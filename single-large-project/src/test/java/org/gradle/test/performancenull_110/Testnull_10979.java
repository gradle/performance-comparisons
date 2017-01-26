package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10979 {
    private final Productionnull_10979 production = new Productionnull_10979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}