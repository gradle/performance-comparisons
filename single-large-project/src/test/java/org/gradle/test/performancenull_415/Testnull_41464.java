package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41464 {
    private final Productionnull_41464 production = new Productionnull_41464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}