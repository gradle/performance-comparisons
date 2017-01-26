package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12993 {
    private final Productionnull_12993 production = new Productionnull_12993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}