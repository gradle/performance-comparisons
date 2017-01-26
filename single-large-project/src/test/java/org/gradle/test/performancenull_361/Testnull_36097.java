package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36097 {
    private final Productionnull_36097 production = new Productionnull_36097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}