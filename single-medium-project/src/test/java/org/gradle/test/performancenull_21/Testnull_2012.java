package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2012 {
    private final Productionnull_2012 production = new Productionnull_2012("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}