package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20326 {
    private final Productionnull_20326 production = new Productionnull_20326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}