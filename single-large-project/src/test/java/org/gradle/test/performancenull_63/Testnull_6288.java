package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6288 {
    private final Productionnull_6288 production = new Productionnull_6288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}