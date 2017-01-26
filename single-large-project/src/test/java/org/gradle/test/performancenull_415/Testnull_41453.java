package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41453 {
    private final Productionnull_41453 production = new Productionnull_41453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}