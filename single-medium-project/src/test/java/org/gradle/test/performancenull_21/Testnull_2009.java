package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2009 {
    private final Productionnull_2009 production = new Productionnull_2009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}