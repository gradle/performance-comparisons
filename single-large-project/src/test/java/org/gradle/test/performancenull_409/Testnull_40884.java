package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40884 {
    private final Productionnull_40884 production = new Productionnull_40884("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}