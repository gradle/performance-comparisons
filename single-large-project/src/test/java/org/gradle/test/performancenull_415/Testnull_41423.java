package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41423 {
    private final Productionnull_41423 production = new Productionnull_41423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}