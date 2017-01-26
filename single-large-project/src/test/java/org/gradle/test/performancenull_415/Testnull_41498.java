package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41498 {
    private final Productionnull_41498 production = new Productionnull_41498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}