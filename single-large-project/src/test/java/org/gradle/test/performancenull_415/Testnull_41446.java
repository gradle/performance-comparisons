package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41446 {
    private final Productionnull_41446 production = new Productionnull_41446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}