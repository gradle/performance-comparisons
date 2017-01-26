package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19189 {
    private final Productionnull_19189 production = new Productionnull_19189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}