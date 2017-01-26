package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30284 {
    private final Productionnull_30284 production = new Productionnull_30284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}