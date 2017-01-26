package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21036 {
    private final Productionnull_21036 production = new Productionnull_21036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}