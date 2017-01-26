package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7949 {
    private final Productionnull_7949 production = new Productionnull_7949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}