package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21055 {
    private final Productionnull_21055 production = new Productionnull_21055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}