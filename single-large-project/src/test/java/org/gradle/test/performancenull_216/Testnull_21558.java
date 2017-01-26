package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21558 {
    private final Productionnull_21558 production = new Productionnull_21558("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}