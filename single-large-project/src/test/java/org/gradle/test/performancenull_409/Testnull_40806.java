package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40806 {
    private final Productionnull_40806 production = new Productionnull_40806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}