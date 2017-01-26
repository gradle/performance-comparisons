package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20127 {
    private final Productionnull_20127 production = new Productionnull_20127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}