package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20167 {
    private final Productionnull_20167 production = new Productionnull_20167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}