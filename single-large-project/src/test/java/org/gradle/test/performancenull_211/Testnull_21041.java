package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21041 {
    private final Productionnull_21041 production = new Productionnull_21041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}