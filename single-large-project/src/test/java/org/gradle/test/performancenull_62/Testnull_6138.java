package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6138 {
    private final Productionnull_6138 production = new Productionnull_6138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}