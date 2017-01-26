package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40847 {
    private final Productionnull_40847 production = new Productionnull_40847("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}