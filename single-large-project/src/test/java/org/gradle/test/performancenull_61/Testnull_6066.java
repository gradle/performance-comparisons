package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6066 {
    private final Productionnull_6066 production = new Productionnull_6066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}