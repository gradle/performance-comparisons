package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41491 {
    private final Productionnull_41491 production = new Productionnull_41491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}