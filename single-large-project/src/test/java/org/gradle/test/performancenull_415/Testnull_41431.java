package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41431 {
    private final Productionnull_41431 production = new Productionnull_41431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}