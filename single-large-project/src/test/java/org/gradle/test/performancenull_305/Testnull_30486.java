package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30486 {
    private final Productionnull_30486 production = new Productionnull_30486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}