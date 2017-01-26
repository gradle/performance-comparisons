package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18846 {
    private final Productionnull_18846 production = new Productionnull_18846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}