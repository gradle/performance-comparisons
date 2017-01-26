package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21100 {
    private final Productionnull_21100 production = new Productionnull_21100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}