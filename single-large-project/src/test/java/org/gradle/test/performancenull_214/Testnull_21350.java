package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21350 {
    private final Productionnull_21350 production = new Productionnull_21350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}