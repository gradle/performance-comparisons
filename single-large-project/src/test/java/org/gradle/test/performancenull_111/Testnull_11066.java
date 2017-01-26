package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11066 {
    private final Productionnull_11066 production = new Productionnull_11066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}