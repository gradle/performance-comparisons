package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27068 {
    private final Productionnull_27068 production = new Productionnull_27068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}