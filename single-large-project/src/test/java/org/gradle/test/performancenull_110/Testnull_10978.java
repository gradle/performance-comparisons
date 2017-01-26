package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10978 {
    private final Productionnull_10978 production = new Productionnull_10978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}