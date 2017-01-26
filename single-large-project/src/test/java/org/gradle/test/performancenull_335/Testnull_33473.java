package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33473 {
    private final Productionnull_33473 production = new Productionnull_33473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}