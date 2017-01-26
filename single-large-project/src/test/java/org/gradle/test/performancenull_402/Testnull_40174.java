package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40174 {
    private final Productionnull_40174 production = new Productionnull_40174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}