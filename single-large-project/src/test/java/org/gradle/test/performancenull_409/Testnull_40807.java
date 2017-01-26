package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40807 {
    private final Productionnull_40807 production = new Productionnull_40807("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}