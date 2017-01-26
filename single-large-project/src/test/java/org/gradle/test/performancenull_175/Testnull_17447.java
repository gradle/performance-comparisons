package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17447 {
    private final Productionnull_17447 production = new Productionnull_17447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}