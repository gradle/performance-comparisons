package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13097 {
    private final Productionnull_13097 production = new Productionnull_13097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}