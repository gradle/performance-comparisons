package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21166 {
    private final Productionnull_21166 production = new Productionnull_21166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}