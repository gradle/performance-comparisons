package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2005 {
    private final Productionnull_2005 production = new Productionnull_2005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}