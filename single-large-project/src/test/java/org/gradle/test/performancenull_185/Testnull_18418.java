package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18418 {
    private final Productionnull_18418 production = new Productionnull_18418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}