package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3072 {
    private final Productionnull_3072 production = new Productionnull_3072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}