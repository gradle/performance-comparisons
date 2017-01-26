package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36745 {
    private final Productionnull_36745 production = new Productionnull_36745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}