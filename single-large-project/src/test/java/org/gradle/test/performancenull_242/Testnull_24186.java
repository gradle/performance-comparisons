package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24186 {
    private final Productionnull_24186 production = new Productionnull_24186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}