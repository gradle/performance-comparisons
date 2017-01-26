package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41486 {
    private final Productionnull_41486 production = new Productionnull_41486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}