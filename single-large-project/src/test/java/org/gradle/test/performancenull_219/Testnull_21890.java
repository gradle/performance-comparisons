package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21890 {
    private final Productionnull_21890 production = new Productionnull_21890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}