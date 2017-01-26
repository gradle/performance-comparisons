package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10373 {
    private final Productionnull_10373 production = new Productionnull_10373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}