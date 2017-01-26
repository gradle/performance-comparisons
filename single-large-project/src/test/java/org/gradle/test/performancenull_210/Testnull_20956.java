package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20956 {
    private final Productionnull_20956 production = new Productionnull_20956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}