package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47354 {
    private final Productionnull_47354 production = new Productionnull_47354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}