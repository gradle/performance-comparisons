package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18090 {
    private final Productionnull_18090 production = new Productionnull_18090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}