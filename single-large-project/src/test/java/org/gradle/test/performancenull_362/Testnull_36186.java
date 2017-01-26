package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36186 {
    private final Productionnull_36186 production = new Productionnull_36186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}