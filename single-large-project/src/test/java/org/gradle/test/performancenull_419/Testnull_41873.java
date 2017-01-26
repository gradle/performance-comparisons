package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41873 {
    private final Productionnull_41873 production = new Productionnull_41873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}