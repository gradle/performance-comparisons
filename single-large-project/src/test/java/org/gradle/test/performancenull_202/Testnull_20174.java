package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20174 {
    private final Productionnull_20174 production = new Productionnull_20174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}