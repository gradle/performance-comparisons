package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6326 {
    private final Productionnull_6326 production = new Productionnull_6326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}