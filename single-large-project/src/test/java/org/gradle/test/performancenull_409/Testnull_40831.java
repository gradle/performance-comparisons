package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40831 {
    private final Productionnull_40831 production = new Productionnull_40831("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}