package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24943 {
    private final Productionnull_24943 production = new Productionnull_24943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}