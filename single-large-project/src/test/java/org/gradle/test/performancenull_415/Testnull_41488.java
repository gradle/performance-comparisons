package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41488 {
    private final Productionnull_41488 production = new Productionnull_41488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}