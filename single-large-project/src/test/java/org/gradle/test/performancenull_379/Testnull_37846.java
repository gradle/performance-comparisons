package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37846 {
    private final Productionnull_37846 production = new Productionnull_37846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}