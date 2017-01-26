package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41468 {
    private final Productionnull_41468 production = new Productionnull_41468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}