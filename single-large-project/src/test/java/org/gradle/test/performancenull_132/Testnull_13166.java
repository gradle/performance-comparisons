package org.gradle.test.performancenull_132;

import static org.junit.Assert.*;

public class Testnull_13166 {
    private final Productionnull_13166 production = new Productionnull_13166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}