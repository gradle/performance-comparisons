package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40784 {
    private final Productionnull_40784 production = new Productionnull_40784("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}