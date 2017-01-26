package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4704 {
    private final Productionnull_4704 production = new Productionnull_4704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}