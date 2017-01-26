package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41500 {
    private final Productionnull_41500 production = new Productionnull_41500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}