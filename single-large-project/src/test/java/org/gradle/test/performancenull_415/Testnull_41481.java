package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41481 {
    private final Productionnull_41481 production = new Productionnull_41481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}