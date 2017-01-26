package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22418 {
    private final Productionnull_22418 production = new Productionnull_22418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}