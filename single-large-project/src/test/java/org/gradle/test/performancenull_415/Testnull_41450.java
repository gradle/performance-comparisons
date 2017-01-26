package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41450 {
    private final Productionnull_41450 production = new Productionnull_41450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}