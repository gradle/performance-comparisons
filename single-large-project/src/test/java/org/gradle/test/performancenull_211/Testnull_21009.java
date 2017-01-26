package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21009 {
    private final Productionnull_21009 production = new Productionnull_21009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}