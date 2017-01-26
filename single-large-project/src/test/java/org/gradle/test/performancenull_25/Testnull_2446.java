package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2446 {
    private final Productionnull_2446 production = new Productionnull_2446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}