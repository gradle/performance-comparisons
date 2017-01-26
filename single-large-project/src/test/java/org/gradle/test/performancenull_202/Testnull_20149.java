package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20149 {
    private final Productionnull_20149 production = new Productionnull_20149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}