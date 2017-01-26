package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2014 {
    private final Productionnull_2014 production = new Productionnull_2014("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}