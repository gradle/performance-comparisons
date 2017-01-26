package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21361 {
    private final Productionnull_21361 production = new Productionnull_21361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}