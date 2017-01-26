package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41490 {
    private final Productionnull_41490 production = new Productionnull_41490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}