package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10354 {
    private final Productionnull_10354 production = new Productionnull_10354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}