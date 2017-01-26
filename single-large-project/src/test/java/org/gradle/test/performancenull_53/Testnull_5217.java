package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5217 {
    private final Productionnull_5217 production = new Productionnull_5217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}