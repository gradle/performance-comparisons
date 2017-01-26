package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29951 {
    private final Productionnull_29951 production = new Productionnull_29951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}