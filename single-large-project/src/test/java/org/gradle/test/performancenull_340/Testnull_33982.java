package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33982 {
    private final Productionnull_33982 production = new Productionnull_33982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}