package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40189 {
    private final Productionnull_40189 production = new Productionnull_40189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}