package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47979 {
    private final Productionnull_47979 production = new Productionnull_47979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}