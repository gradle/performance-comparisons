package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41456 {
    private final Productionnull_41456 production = new Productionnull_41456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}