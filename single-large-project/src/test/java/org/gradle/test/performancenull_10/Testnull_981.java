package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_981 {
    private final Productionnull_981 production = new Productionnull_981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}