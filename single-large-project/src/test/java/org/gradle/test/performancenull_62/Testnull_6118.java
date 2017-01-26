package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6118 {
    private final Productionnull_6118 production = new Productionnull_6118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}