package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6949 {
    private final Productionnull_6949 production = new Productionnull_6949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}