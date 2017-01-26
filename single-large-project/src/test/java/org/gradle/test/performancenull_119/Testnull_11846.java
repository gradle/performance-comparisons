package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11846 {
    private final Productionnull_11846 production = new Productionnull_11846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}