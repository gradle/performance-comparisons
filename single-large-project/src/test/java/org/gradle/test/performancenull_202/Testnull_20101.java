package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20101 {
    private final Productionnull_20101 production = new Productionnull_20101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}