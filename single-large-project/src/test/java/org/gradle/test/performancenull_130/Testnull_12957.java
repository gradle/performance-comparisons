package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12957 {
    private final Productionnull_12957 production = new Productionnull_12957("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}