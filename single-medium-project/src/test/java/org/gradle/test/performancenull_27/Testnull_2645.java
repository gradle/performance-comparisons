package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2645 {
    private final Productionnull_2645 production = new Productionnull_2645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}