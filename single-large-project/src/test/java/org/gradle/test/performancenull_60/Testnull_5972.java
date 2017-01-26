package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5972 {
    private final Productionnull_5972 production = new Productionnull_5972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}