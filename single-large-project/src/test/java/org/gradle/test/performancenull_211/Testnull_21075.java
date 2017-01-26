package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21075 {
    private final Productionnull_21075 production = new Productionnull_21075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}