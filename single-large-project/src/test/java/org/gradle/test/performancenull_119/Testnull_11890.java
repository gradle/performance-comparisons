package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11890 {
    private final Productionnull_11890 production = new Productionnull_11890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}