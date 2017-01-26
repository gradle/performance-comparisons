package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12090 {
    private final Productionnull_12090 production = new Productionnull_12090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}