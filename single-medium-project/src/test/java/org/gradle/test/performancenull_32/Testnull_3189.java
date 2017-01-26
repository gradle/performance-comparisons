package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3189 {
    private final Productionnull_3189 production = new Productionnull_3189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}