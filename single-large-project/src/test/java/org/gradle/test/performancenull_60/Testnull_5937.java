package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5937 {
    private final Productionnull_5937 production = new Productionnull_5937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}