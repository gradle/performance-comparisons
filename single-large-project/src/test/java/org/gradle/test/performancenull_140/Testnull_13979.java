package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13979 {
    private final Productionnull_13979 production = new Productionnull_13979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}