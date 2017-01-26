package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36046 {
    private final Productionnull_36046 production = new Productionnull_36046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}