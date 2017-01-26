package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36042 {
    private final Productionnull_36042 production = new Productionnull_36042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}