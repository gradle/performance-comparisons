package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41461 {
    private final Productionnull_41461 production = new Productionnull_41461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}