package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27005 {
    private final Productionnull_27005 production = new Productionnull_27005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}