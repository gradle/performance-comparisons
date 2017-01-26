package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5104 {
    private final Productionnull_5104 production = new Productionnull_5104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}