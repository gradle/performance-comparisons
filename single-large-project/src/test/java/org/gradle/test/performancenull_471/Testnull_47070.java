package org.gradle.test.performancenull_471;

import static org.junit.Assert.*;

public class Testnull_47070 {
    private final Productionnull_47070 production = new Productionnull_47070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}