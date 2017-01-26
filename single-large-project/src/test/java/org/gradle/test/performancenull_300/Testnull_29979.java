package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29979 {
    private final Productionnull_29979 production = new Productionnull_29979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}