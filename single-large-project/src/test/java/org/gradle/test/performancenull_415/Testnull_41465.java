package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41465 {
    private final Productionnull_41465 production = new Productionnull_41465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}