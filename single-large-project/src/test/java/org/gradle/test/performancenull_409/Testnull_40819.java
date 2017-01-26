package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40819 {
    private final Productionnull_40819 production = new Productionnull_40819("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}