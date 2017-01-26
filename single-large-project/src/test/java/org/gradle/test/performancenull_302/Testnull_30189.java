package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30189 {
    private final Productionnull_30189 production = new Productionnull_30189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}