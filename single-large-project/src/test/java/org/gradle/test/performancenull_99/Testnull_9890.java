package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9890 {
    private final Productionnull_9890 production = new Productionnull_9890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}