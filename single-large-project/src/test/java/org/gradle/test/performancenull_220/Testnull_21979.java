package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21979 {
    private final Productionnull_21979 production = new Productionnull_21979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}