package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23189 {
    private final Productionnull_23189 production = new Productionnull_23189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}