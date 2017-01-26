package org.gradle.test.performancenull_159;

import static org.junit.Assert.*;

public class Testnull_15890 {
    private final Productionnull_15890 production = new Productionnull_15890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}