package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41405 {
    private final Productionnull_41405 production = new Productionnull_41405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}