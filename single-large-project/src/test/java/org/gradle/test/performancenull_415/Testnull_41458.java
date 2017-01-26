package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41458 {
    private final Productionnull_41458 production = new Productionnull_41458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}