package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41487 {
    private final Productionnull_41487 production = new Productionnull_41487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}