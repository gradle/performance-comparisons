package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41430 {
    private final Productionnull_41430 production = new Productionnull_41430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}