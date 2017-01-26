package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_6000 {
    private final Productionnull_6000 production = new Productionnull_6000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}