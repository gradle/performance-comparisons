package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20161 {
    private final Productionnull_20161 production = new Productionnull_20161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}