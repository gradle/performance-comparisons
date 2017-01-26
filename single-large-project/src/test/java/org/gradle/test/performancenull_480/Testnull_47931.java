package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47931 {
    private final Productionnull_47931 production = new Productionnull_47931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}