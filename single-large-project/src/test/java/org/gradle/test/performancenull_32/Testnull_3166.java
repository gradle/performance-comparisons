package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3166 {
    private final Productionnull_3166 production = new Productionnull_3166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}