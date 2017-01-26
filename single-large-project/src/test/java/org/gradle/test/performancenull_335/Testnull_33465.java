package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33465 {
    private final Productionnull_33465 production = new Productionnull_33465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}