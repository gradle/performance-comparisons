package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41475 {
    private final Productionnull_41475 production = new Productionnull_41475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}