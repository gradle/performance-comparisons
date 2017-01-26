package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21846 {
    private final Productionnull_21846 production = new Productionnull_21846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}