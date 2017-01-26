package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20122 {
    private final Productionnull_20122 production = new Productionnull_20122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}