package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21089 {
    private final Productionnull_21089 production = new Productionnull_21089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}