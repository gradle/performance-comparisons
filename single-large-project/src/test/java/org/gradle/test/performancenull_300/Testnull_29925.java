package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29925 {
    private final Productionnull_29925 production = new Productionnull_29925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}