package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2445 {
    private final Productionnull_2445 production = new Productionnull_2445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}