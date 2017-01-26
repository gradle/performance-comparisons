package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2013 {
    private final Productionnull_2013 production = new Productionnull_2013("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}