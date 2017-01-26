package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7981 {
    private final Productionnull_7981 production = new Productionnull_7981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}