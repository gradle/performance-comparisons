package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23349 {
    private final Productionnull_23349 production = new Productionnull_23349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}